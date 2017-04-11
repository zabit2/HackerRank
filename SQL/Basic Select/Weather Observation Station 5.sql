select * from (select min(city),length(city) from station group by length(city) order by length(city)) where rownum <= 1;
select * from (select max(city),length(city) from station group by length(city) order by length(city) desc) where rownum <= 1;
