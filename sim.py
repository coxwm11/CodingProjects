import sys

def xInput(x):
#Prints x values for the number of rows requested
    
    for x in range(1,int(x)+1):

        print (x)
    


 
def yInput():
#Enter y-values here
    y_list = list()
    yInput = raw_input("Press y to begin entering y-values:")

#y
    y = input("Y: ")
    y_list.append(y)
#y1
    y1 = input("Y1: ")
    y_list.append(y1)
#y2
    y2 = input("Y2: ")
    y_list.append(y2)
#y3    
    y3 = input("Y3: ")
    y_list.append(y3)
#y4    
    y4 = input("Y4: ")
    y_list.append(y4)
#y5    
    y5 = input("Y5: ")
    y_list.append(y5)

    return y_list



def rowHeading():
#Formats heading of table
    rowHeading = ("x","y", "y1", "y2","y3","y4","y5")
    format_string = "%s %s %s %s %s %s %s"
    print(format_string % rowHeading)
    print("_____________________________________________________")



def calRow1(y):
#Goes through and adds first y-inputs to produce row 2    
    
    rowOne = list()
    i = 0
    j = 1
    k = len(rowOne)
    while i < len(y):
	while j < len (y):
		lineOne= y[i] + y[j]

        	i += 1
		j +=1
        	rowOne.append(int(lineOne))
	
    	return rowOne
    


def nextLine(rowNumber, y):
#Updates the list that goes through calculations
    
    x = 0
    while x < rowNumber:
        nextLine = calRow1(y)
        print nextLine
        x += 1
        y = nextLine
    
       
            

def main():

    rowNumber = input("How many rows would you like to compute?")

#Calls the function to input 5 y-values
    y_list = yInput()

#Creates a heading for table  
    rowHeading()

#Prints list of y-input values
    print y_list

#Calls function to calculate y-values and prints list
    nextLine(rowNumber, y_list)
        
        


    

    

    

    


if __name__ == "__main__":
    main()                       

