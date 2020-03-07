import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMaven {

    private static final Logger LOG = LoggerFactory.getLogger(TestMaven.class);


    public static void main( String[] args )
    {
        System.out.println( "My Maven test project" );
        LOG.info("Hello this is test!");
        LOG.error("This is error message!");
        LOG.trace("This is trace message!");
        LOG.warn("This is warn message!");

    }
}
