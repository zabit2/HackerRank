#!/bin/bash
for a in {1..100}
do
if(($a%2 != 0))
then
echo $a
fi
done
