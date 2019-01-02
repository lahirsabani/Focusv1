<?xml version = '1.0' encoding = 'UTF-8'?>
<trigger xmlns="http://xmlns.oracle.com/jdeveloper/1111/offlinedb">
  <ID class="oracle.javatools.db.IdentifierBasedID">
    <identifier class="java.lang.String">f80b24de-876a-42ed-955d-15d8eadfc602</identifier>
  </ID>
  <name>FCS_PROD_LOC_PARENT_INSERT</name>
  <baseType>TABLE</baseType>
  <code>DECLARE
   --PRAGMA AUTONOMOUS_TRANSACTION;
   V_PPID   NUMBER;
BEGIN
   -- CREATED BY   : MII - AHMADKU
   -- CREATE DATE  : 30-AGT-2018
   -- REASON       : DIGUNAKAN UNTUK INSERT REGION CODE KE TABLE APP_USER_REGION
   V_PPID := :NEW.PROMO_PRODUK_ID;
   
   INSERT INTO PROD_REGION (PROMO_PRODUK_ID, REGION_CODE, NOTES)
        SELECT DISTINCT V_PPID, AC.ATTRIBUTE3, FFVV.DESCRIPTION
        FROM APPS.AR_CUSTOMERS AC, APPS.FND_FLEX_VALUE_SETS FFV, APPS.FND_FLEX_VALUES_VL FFVV
        WHERE 1=1 AND AC.ATTRIBUTE5 = :NEW.LOCATION_CODE
        AND AC.ATTRIBUTE3 NOT IN (SELECT REGION_CODE FROM PROD_REGION WHERE PROMO_PRODUK_ID = V_PPID)
        AND FFV.FLEX_VALUE_SET_ID = FFVV.FLEX_VALUE_SET_ID
        AND FFV.FLEX_VALUE_SET_NAME = &apos;FCSAR_TERRITORY_REGION&apos;
        AND FFVV.ENABLED_FLAG = &apos;Y&apos;
        AND FLEX_VALUE = AC.ATTRIBUTE3
        GROUP BY AC.ATTRIBUTE3, FFVV.DESCRIPTION;

   INSERT INTO PROD_REGION_AREA (PROMO_PRODUK_ID, AREA_CODE, NOTES)   
        SELECT DISTINCT V_PPID, AC.ATTRIBUTE4, FFVV.DESCRIPTION
        FROM APPS.AR_CUSTOMERS AC, APPS.FND_FLEX_VALUE_SETS FFV, APPS.FND_FLEX_VALUES_VL FFVV
        WHERE 1=1 AND AC.ATTRIBUTE5 = :NEW.LOCATION_CODE
        AND AC.ATTRIBUTE4 NOT IN (SELECT AREA_CODE FROM PROD_REGION_AREA WHERE PROMO_PRODUK_ID = V_PPID)
        AND FFV.FLEX_VALUE_SET_ID = FFVV.FLEX_VALUE_SET_ID
        AND FFV.FLEX_VALUE_SET_NAME = &apos;FCSAR_TERRITORY_AREA&apos;
        AND FFVV.ENABLED_FLAG = &apos;Y&apos;
        AND FLEX_VALUE = AC.ATTRIBUTE4
        GROUP BY AC.ATTRIBUTE4, FFVV.DESCRIPTION;
END;</code>
  <enabled>true</enabled>
  <events>
    <event>INSERT</event>
  </events>
  <properties>
    <entry>
      <key>OfflineDBConstants.IMPORT_SOURCE_CONNECTION</key>
      <value class="java.lang.String">focuspp</value>
    </entry>
    <entry>
      <key>OfflineDBConstants.IMPORT_SOURCE_ID</key>
      <value class="oracle.javatools.db.ReferenceID">
        <name>FCS_PROD_LOC_PARENT_INSERT</name>
        <identifier class="java.math.BigDecimal">111883</identifier>
        <schemaName>FOCUSPP2</schemaName>
        <type>TRIGGER</type>
      </value>
    </entry>
  </properties>
  <schema>
    <name>FOCUSPP2</name>
  </schema>
  <source>TRIGGER FOCUSPP2.FCS_PROD_LOC_PARENT_INSERT
AFTER INSERT
ON FOCUSPP2.PROD_REGION_LOC REFERENCING NEW AS NEW OLD AS OLD
FOR EACH ROW
DECLARE
   --PRAGMA AUTONOMOUS_TRANSACTION;
   V_PPID   NUMBER;
BEGIN
   -- CREATED BY   : MII - AHMADKU
   -- CREATE DATE  : 30-AGT-2018
   -- REASON       : DIGUNAKAN UNTUK INSERT REGION CODE KE TABLE APP_USER_REGION
   V_PPID := :NEW.PROMO_PRODUK_ID;
   
   INSERT INTO PROD_REGION (PROMO_PRODUK_ID, REGION_CODE, NOTES)
        SELECT DISTINCT V_PPID, AC.ATTRIBUTE3, FFVV.DESCRIPTION
        FROM APPS.AR_CUSTOMERS AC, APPS.FND_FLEX_VALUE_SETS FFV, APPS.FND_FLEX_VALUES_VL FFVV
        WHERE 1=1 AND AC.ATTRIBUTE5 = :NEW.LOCATION_CODE
        AND AC.ATTRIBUTE3 NOT IN (SELECT REGION_CODE FROM PROD_REGION WHERE PROMO_PRODUK_ID = V_PPID)
        AND FFV.FLEX_VALUE_SET_ID = FFVV.FLEX_VALUE_SET_ID
        AND FFV.FLEX_VALUE_SET_NAME = &apos;FCSAR_TERRITORY_REGION&apos;
        AND FFVV.ENABLED_FLAG = &apos;Y&apos;
        AND FLEX_VALUE = AC.ATTRIBUTE3
        GROUP BY AC.ATTRIBUTE3, FFVV.DESCRIPTION;

   INSERT INTO PROD_REGION_AREA (PROMO_PRODUK_ID, AREA_CODE, NOTES)   
        SELECT DISTINCT V_PPID, AC.ATTRIBUTE4, FFVV.DESCRIPTION
        FROM APPS.AR_CUSTOMERS AC, APPS.FND_FLEX_VALUE_SETS FFV, APPS.FND_FLEX_VALUES_VL FFVV
        WHERE 1=1 AND AC.ATTRIBUTE5 = :NEW.LOCATION_CODE
        AND AC.ATTRIBUTE4 NOT IN (SELECT AREA_CODE FROM PROD_REGION_AREA WHERE PROMO_PRODUK_ID = V_PPID)
        AND FFV.FLEX_VALUE_SET_ID = FFVV.FLEX_VALUE_SET_ID
        AND FFV.FLEX_VALUE_SET_NAME = &apos;FCSAR_TERRITORY_AREA&apos;
        AND FFVV.ENABLED_FLAG = &apos;Y&apos;
        AND FLEX_VALUE = AC.ATTRIBUTE4
        GROUP BY AC.ATTRIBUTE4, FFVV.DESCRIPTION;
END; 
</source>
  <statementLevel>false</statementLevel>
  <tableID class="oracle.javatools.db.ReferenceID">
    <name>PROD_REGION_LOC</name>
    <identifier class="java.math.BigDecimal">111765</identifier>
    <schemaName>FOCUSPP2</schemaName>
    <type>TABLE</type>
  </tableID>
  <timing>AFTER</timing>
</trigger>
