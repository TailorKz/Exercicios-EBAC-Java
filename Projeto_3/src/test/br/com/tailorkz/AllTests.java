package test.br.com.tailorkz;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ test.br.com.tailorkz.ClienteServiceTest.class, test.br.com.tailorkz.ClienteDAOTest.class,
        test.br.com.tailorkz.ProdutoServiceTest.class, test.br.com.tailorkz.ProdutoDAOTest.class,
        test.br.com.tailorkz.VendaDAOTest.class})
public class AllTests {

}
