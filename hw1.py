import sys
import copy
class Car():
    _char = None
    _list_positions = None
    #_direction=> 'lr', 'ud'
    _direction=None

    #def __init__(self):
    def setCharacter(self, char):
        self._char = char
        self._list_positions = list()

    def setPosition(self, el):
        retval = True

        #check proper type
        if isinstance(self._char, str) == False:
            return False

        #check proper length
        if len(self._char) != 1:
            return False
        #[0,1]
        self._list_positions.append(el)

    def setDirection(self):
        if self._char is None:
            return False

        if self._list_positions is None:
            return False

        if len(self._list_positions) < 2:
            return False

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
def printBoard(boardMatrix):
    
    print("-" * len(boardMatrix[0]) )

    for i in boardMatrix:

        print ("|" + i + "|")

     
    print("-" * len(boardMatrix[0]) )

    

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

    inputString = "  o aa|  o   |xxo   |ppp  q|     q|     q"
    list_car_chars = []
    ignore_chars = ['|', ' ']
    Cars = []

    # get all car chars
    for i in range(0, len(inputString)):
        if inputString[i] in list_car_chars:
            continue
        if inputString[i] in ignore_chars:
            continue

        #catalog that we have already added this car
        list_car_chars.append(inputString[i])
        #create a car object
        temp_car = Car()

        #set the cars character
        temp_car.setCharacter(inputString[i])

        #store the car
        Cars.append(temp_car)

    #store the car matrix as an array
    boardMatrix = inputString.split('|')

    # set positions and direction for all cars
    for car_i in range(0, len(Cars)):
        for row_i in range(0, len(boardMatrix)):
            for col_i in range(0, len(boardMatrix[row_i])):
                # find the car represented by the index
                if(boardMatrix[row_i][col_i] == Cars[car_i].getCharacter()):
                    Cars[car_i].setPosition([row_i, col_i])

        Cars[car_i].setDirection()


    print(Cars[0].getPositions())
    solutionState(boardMatrix)
    printBoard(boardMatrix)
    
    #print(sys.argv)        
        
        


    

    

    

    


if __name__ == "__main__":
    main()
