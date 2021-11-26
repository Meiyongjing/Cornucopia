import java.io.IOException;
import java.io.UnsupportedEncodingException;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64Sample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = null;
		try {
			bytes = "base64".getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// base64����
		String baseEncoder = new BASE64Encoder().encode(bytes);

		// base64����
		byte[] decodeBuffer = new BASE64Decoder().decodeBuffer(baseEncoder);
		
		System.out.println(new String(decodeBuffer, "utf-8"));
	}
}