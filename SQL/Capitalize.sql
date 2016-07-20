CREATE DEFINER=`root`@`localhost` FUNCTION `initcap`(input VARCHAR(255)) RETURNS varchar(255) CHARSET utf8
DETERMINISTIC
  BEGIN
    DECLARE l INT;
    DECLARE i INT;

    SET l   = CHAR_LENGTH(input);
    SET input = LOWER(input);
    SET i = 0;

    WHILE (i < l) DO
      IF (MID(input,i,1) = ' ' OR i = 0) THEN
        IF (i < l) THEN
          SET input = CONCAT(
              LEFT(input,i),
              UPPER(MID(input,i + 1,1)),
              RIGHT(input,l - i - 1)
          );
        END IF;
      END IF;
      SET i = i + 1;
    END WHILE;

    RETURN input;
  END
