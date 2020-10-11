import sys


def print_function(a,b,c,d,e,f,g,h):

    
    
    defaultBoard = [a,b,c , d, e, f, g, h]
    for i in range(len(defaultBoard)):
        for j in range (len(defaultBoard[i])):
            print(defaultBoard[i][j])





def solutionState(carLane):

    
    
     
    if carLane[3] and carLane[4] == "x":

        response= "True"
        print(response)

    else:
        response = "False"
        print(response)
    



def main():

    
    carLane1 = "|xxo   "
    a = ["------"]
    b = ["| o aa|"]
    c = ["| o   |"]
    d = [carLane]
    e = ["|ppp q|"]
    f = ["|    q|"]
    g = ["|    q|"]
    h = ["------"]

    print_function(a,b,c,d,e,f,g,h)

    solutionState(carLane)
    
        
        
        


    

    

    

    


if __name__ == "__main__":
    main()                       

