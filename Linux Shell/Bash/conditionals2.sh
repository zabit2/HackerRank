#!/bin/bash
read a
read b
read c
if [[ ($a == $b) && ($b == $c) && ($c == $a) ]]
then
echo EQUILATERAL
elif [[ (($a!=$b)&&($b!=$c)) || (($b!=$c)&&($c!=$a)) || (($c!=$a)&&($a!=$b))]]
then
echo SCALENE
else
echo ISOSCELES
fi
