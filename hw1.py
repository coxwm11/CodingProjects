import sys
import copy

class Board():
    _inputString = None
    _boardMatrix = None

    #create board using inputString
    def __init__(self, inputString):
        self._inputString = inputString
        self._createBoardMatrix()

    def _createBoardMatrix(self):
        self._boardMatrix = self._inputString.split('|')

    def getBoardMatrix(self):
        return self._boardMatrix

    def printBoard(self):
        print("-" * len(self._boardMatrix[0]))

        for i in self._boardMatrix:
            print("|" + i + "|")

        print("-" * len(self._boardMatrix[0]))

    

class Car():
    _char = None
    _list_positions = None
    #_direction=> 'lr', 'ud'
    _direction=None

    def __init__(self, char):
        self._char = char
        self._list_positions = list()
           
    #def setCharacter(self, char):
    #    self._char = char
    #    self._list_positions = list()

    def setPosition(self, el):

        ####################
        #check proper type
        #if isinstance(self._char, str) == False:
        #check proper length
        #if len(self._char) != 1:
        #    return False
        ############
        
        # [0,1]        
        self._list_positions.append(el)

    def setDirection(self):
        ###################################
        #if self._char is None:
        #    return False
        #if self._list_positions is None:
        #    return False
        #if len(self._list_positions) < 2:
        #    return False
        ###################################

        # determine if the car is gong left to right
        if self._list_positions[0][0] == self._list_positions[1][0]:
            # assume that no rules are being violated
            self._direction = 'lr'

        # determine the car is going up and down
        if self._list_positions[0][1] == self._list_positions[1][1]:
            # assume that no rules are being violated
            self._direction = 'ud'


    #gets the Cars Character Reprensentation
    def getCharacter(self):
        return self._char

    def getPositions(self):
        return self._list_positions



# these next functions in board
# print board
# def printBoard(boardMatrix):
#
#     print("-" * len(boardMatrix[0]) )
#
#     for i in boardMatrix:
#
#         print ("|" + i + "|")
#
#
#     print("-" * len(boardMatrix[0]) )

    

# solutionState
def solutionState(boardMatrix):
#Determines if car is at the exit
    
    if boardMatrix[2][4] and boardMatrix[2][5] == "x":

        response= "True"
        print(response)

    else:
        response = "False"
        print(response)
    



def main():
    
    #set default inputString
    inputString = "  o aa|  o   |xxo   |ppp  q|     q|     q"    

    #count of arguments
    argc = len(sys.argv)
    command = sys.argv[1]

    #update inputString if one was provided
    if(argc == 3):
       inputString = sys.argv[2]

    #list of cars  
    list_car_chars = []

    #characters that are not cars 
    ignore_chars = ['|', ' ']

    #variable for storing car classes
    cars = []

    # get all car chars using the inputString
    # the list of cars that we need to place on the board
    for i in range(0, len(inputString)):
        
        #if this car has already been processed
        #from the inputString
        if inputString[i] in list_car_chars:
            continue

        #if this is not a car chracter
        if inputString[i] in ignore_chars:
            continue

        #catalog that we have already added this car
        list_car_chars.append(inputString[i])

        #create a car object
        #set the cars character
        temp_car = Car(inputString[i])

        #store the car
        cars.append(temp_car)

    #store the car matrix as an array
    board = Board(inputString)

    # set positions and direction for all cars
    tempBoardMatrix = None
    for car_i in range(0, len(cars)):
        
        #set position
        tempBoardMatrix = board.getBoardMatrix()
        for row_i in range(0, len(tempBoardMatrix)):
            for col_i in range(0, len(tempBoardMatrix[row_i])):
                # find the car represented by the index
                if(tempBoardMatrix[row_i][col_i] == cars[car_i].getCharacter()):
                    cars[car_i].setPosition([row_i, col_i])

        #set the direction
        cars[car_i].setDirection()

    #make decision based on command
    if (command == "print"):
        #print(board.getBoardMatrix())
        board.printBoard()

    print(cars[0].getPositions())
    #solutionState(boardMatrix)
    #printBoard(boardMatrix)
    
    #print(sys.argv)        
        
        


    

    

    

    


if __name__ == "__main__":
    main()
