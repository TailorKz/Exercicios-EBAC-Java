package java.br.com.tailorkz;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.br.com.tailorkz.*;


@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
	ProdutoServiceTest.class, ProdutoDAOTest.class,
	VendaDAOTest.class})
public class AllTests {

}
