import java.io.Serializable;

public interface AlignStrategy extends Serializable {
	public void render(Paragraph paragraph, AlignContext alignContext);
}
