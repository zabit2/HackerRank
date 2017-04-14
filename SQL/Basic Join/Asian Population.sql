select sum(a.population) from city a,country b where b.continent = 'Asia' and a.countrycode = b.code;
