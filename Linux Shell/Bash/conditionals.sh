#!/bin/bash
read x
if [[ ($x == 'y') || ($x == 'Y') ]]
then
echo YES
elif [[ ($x == 'n') || ($x == 'N') ]]
then
echo NO
fi
