select distinct city from station where NOT REGEXP_LIKE (city,'^[AEIOU](*)') or NOT REGEXP_LIKE (city,'(*)[aeiou]$');
