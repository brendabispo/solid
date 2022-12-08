package solid_dip_v2;

import java.util.ArrayList;
import java.util.List;

public class TestaDev {

	public static void main(String[] args) {
		
		 List<IDev> devs = new ArrayList<>();

	        devs.add(new FrontendDev());
	        devs.add(new BackendDev());

	        ProjetoSoftware projeto = new ProjetoSoftware(devs);

	        projeto.criarProjeto();

	}

}
