
public class MimicDto implements Cloneable {

	private String name;
	private String id;
	private int index;
	private String status;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {

		return "Id " + this.getId() + " " + "Name " + this.getName() + " " + "Index " + this.getIndex() + " " + "Status " + status;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
			return null;
		}
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
