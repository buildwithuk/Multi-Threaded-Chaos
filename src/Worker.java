import java.util.function.Consumer;
import java.util.function.Supplier;

public class Worker implements Supplier<MimicDto>, Consumer<MimicDto> {

	public MimicDto dto;
	public String code;

	public Worker(MimicDto dto) {

		this.dto = dto;
		this.code = dto.getId();
		dto.setId("# - " + dto.getId());
	}

	@Override
	public MimicDto get() {

		try {
			Thread.sleep(10000);
			dto.setStatus("Finished");
			System.out.println("In " + Thread.currentThread().getName() +  ": " + dto.toString() + " and " + this.code);
			return dto;
		} catch (InterruptedException e) {

			return null;
		}
	}

	@Override
	public void accept(MimicDto t) {
		
		System.out.println(Thread.currentThread().getName() + " " + t.getStatus());
	}
}