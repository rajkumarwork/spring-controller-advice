config.properties
-------------------------------
INPUT_FILE=a.txt

OUTPUT_FILE=output

OUT_FILE_EXTN=txt

NO_OF_LINES=10





split.sh

------------------------------

#!/bin/bash



PROPERTY_FILE=config.properties



function getProperty {

   PROP_KEY=$1

   PROP_VALUE=`cat $PROPERTY_FILE | grep "$PROP_KEY" | cut -d'=' -f2`

   echo $PROP_VALUE

}



INPUT_FILE=$(getProperty "INPUT_FILE")

OUTPUT_FILE=$(getProperty "OUTPUT_FILE")

OUTPUT_FILE_EXTN=$(getProperty "OUT_FILE_EXTN")

NO_OF_LINES=$(getProperty "NO_OF_LINES")



echo $INPUT_FILE

echo $OUTPUT_FILE

echo $OUTPUT_FILE_EXTN

echo $NO_OF_LINES



line=$(head -n 1 $INPUT_FILE)

tail -n +2 $INPUT_FILE > file.stdout

split_lines=`expr $NO_OF_LINES - 1`

split -l $split_lines file.stdout out_temp

count=1

for file in out_temp*

do

    underscore="_"

    dot="."

    name="$OUTPUT_FILE$underscore$count$dot$OUTPUT_FILE_EXTN"

    mv "$file" "$name"

    echo $line | cat - $name > temp && mv temp $name    

    count=`expr $count + 1`

done


rm file.stdout
