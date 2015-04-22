package j2ee.research.java.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.google.common.io.ByteStreams;
import com.google.common.io.Files;
import com.google.common.io.InputSupplier;

public class GuavaRead {
	public static final String PATH="D:/Server/java/nio/crm131021.sql";
	public static void main(String[] args) throws IOException {
		InputSupplier<FileInputStream> fileIn=Files.newInputStreamSupplier(new File(PATH));
		System.out.println(new String(ByteStreams.toByteArray(ByteStreams.slice(fileIn,4073200000L,17800000L))));
		/*for(int i=0;i < 100;i++){
			InputSupplier<InputStream> slicedStream=ByteStreams.slice(fileIn,i*10,100);
			byte[] data=ByteStreams.toByteArray(slicedStream);
			System.out.println(new String(data));
			//System.out.println(new String(data));
		}*/
		/*Files.readBytes(file,new ByteProcessor<String>() {
			public boolean processBytes(byte[] buf, int off, int len) throws IOException {
				return false;
			}

			public String getResult() {
				return null;
			}
			
		});*/
		//ByteStreams.readFully(in,b,off,len);
		//System.out.println(Files.readFirstLine(new File(PATH),Charsets.UTF_8));
		/*Files.readLines(new File(PATH),Charsets.UTF_8,new LineProcessor<Object>() {
			final AtomicLong al=new AtomicLong(0);
			@Override
			public boolean processLine(String line) throws IOException {
				long now=al.longValue();
				//INSERT INTO `reseller` VALUES
				if(now<100 &&line!=null&&line.indexOf("reseller")!=-1){
					al.incrementAndGet();
					System.out.println(line);
					return true;
				}
				return false;
			}

			@Override
			public Object getResult() {
				return null;
			}
		});*/
	}
}
