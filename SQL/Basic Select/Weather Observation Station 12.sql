select distinct city from station where NOT REGEXP_LIKE (city,'^[AEIOU](*)') AND NOT REGEXP_LIKE (city,'(*)[aeiou]$');
