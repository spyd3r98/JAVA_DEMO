package javacodechecker;

import org.apache.commons.codec.binary.StringUtils;

public class AvoidUsingHardCodedCryptographicKey {

    private static final String VALUE = "68af404b513073584c4b6f22b6c63e6b";
    private static final String DATA = "68af404b513073584c4b6f22b6c63e6b";

    public void checkingVALUE(){

        if(StringUtils.equals(VALUE,"68af404b513073584c4b6f22b6c63e6b")){
            logger.info("hard-coded cryptographic key");
        }


        if(VALUE.equals("68af404b513073584c4b6f22b6c63e6b")){
            logger.info("hard-coded cryptographic key");
        }

        if(StringUtils.equals(VALUE,DATA)){
            logger.info("cryptographic key");
        }

        if(VALUE.equals(DATA)){
            logger.info("cryptographic key");
        }
    }
}
