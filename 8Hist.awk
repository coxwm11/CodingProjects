{letterGrade[$NF] = letterGrade[$NF] "*";}
END{

	for (i in letterGrade)
		printf "%s: %s\n", i, letterGrade[i];
   }
