package factorymethod.idcard;

import java.util.HashMap;
import java.util.Map;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

public class IDCardFactory extends Factory {

//	private List<String> owners = new ArrayList();
	private Map<Integer, String> ownersmap = new HashMap<>();
	private int id = 0;

	@Override
	protected synchronized Product createProduct(String owner) {
		return new IDCard(owner, id++);
	}

	@Override
	protected void registerProduct(Product product) {
//		owners.add(((IDCard)product).getOwner());
		ownersmap.put(((IDCard)product).getId(), ((IDCard)product).getOwner());
	}

//	public List getOwners() {
//		return owners;
//	}

	public Map<Integer, String> getOwners() {
		return ownersmap;
	}

	public String getOwnerById(int id) {
		return ownersmap.get(id);
	}

}
