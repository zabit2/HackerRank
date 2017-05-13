#!/bin/bash
sum=0
read size
for i in $(seq 1 $size);
do
read temp
sum=$(( $sum + $temp ))
done
printf "%.3f" $(echo "$sum / $size" | bc -l)
