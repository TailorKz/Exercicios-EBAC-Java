package br.com.tailorkz;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ br.com.tailorkz.ClienteServiceTest.class, br.com.tailorkz.ClienteDAOTest.class,
        br.com.tailorkz.ProdutoServiceTest.class, br.com.tailorkz.ProdutoDAOTest.class,
        br.com.tailorkz.VendaDAOTest.class})
public class AllTests {

}
