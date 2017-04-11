select distinct city from station where NOT REGEXP_LIKE (city,'(*)[aeiouAEIOU]$');
