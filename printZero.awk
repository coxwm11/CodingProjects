{ for (i = 1; i <= NF; i++)
	if($i == 0)
		printf "%s received a zero on Test %d.\n", $1, i-1;

}
