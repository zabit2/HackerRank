select distinct city from station where REGEXP_LIKE (city,'(*)[AEIOUaeiou]$');
