SELECT COUNTRY.continent, FLOOR(AVG(CITY.POPULATION))
FROM CITY
INNER JOIN COUNTRY
ON CITY.countrycode = COUNTRY.code
GROUP BY COUNTRY.continent;