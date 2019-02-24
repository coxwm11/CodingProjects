NR == 1 { lines = NF; }
NF != lines { printf " Please check line %d for correction. It only has %d grades.\n", NR, NF-1; }



