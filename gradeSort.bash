#!/bin/bash

awk '{print $NF}' $1 | sort -nr

