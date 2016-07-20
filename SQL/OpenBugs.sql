SET @startDate  = '2015-07-01';
SET @endDate    = '2015-08-02';

SELECT open_date, count(1) as open_bugs
FROM bugs_log
WHERE open_date >= @startDate
      AND open_date <= @endDate
      AND close_date <= @endDate
GROUP BY open_date;