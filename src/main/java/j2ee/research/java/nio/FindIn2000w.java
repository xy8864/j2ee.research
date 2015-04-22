package j2ee.research.java.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.apache.commons.io.Charsets;

import com.google.common.base.Stopwatch;
import com.google.common.io.Files;
import com.google.common.io.LineProcessor;

public class FindIn2000w {
	public static final String PATH="G:/2000W/all.csv";
	public static final String SMALL="G:/2000W/5000.csv";
	public static final int CACHE_SIZE=1024*100;//1M

	public static boolean binaryStartsWith(byte[] all,byte[] target){
		//Bytes.indexOf(all,target)
		return false;
	}
	public static void readFile() throws IOException{
		System.out.println("****************** readFile ******************");
		int bufSize=100;
		FileChannel fcin=new RandomAccessFile(new File(SMALL),"r").getChannel();
		ByteBuffer readBuffer=ByteBuffer.allocate(bufSize);

		FileChannel fcout=new RandomAccessFile(new File("G:/2000W/result.csv"),"rws").getChannel();
		ByteBuffer writeBuffer=ByteBuffer.allocateDirect(bufSize);

		ByteBuffer buff=ByteBuffer.allocate(CACHE_SIZE);
		FileChannel fc=new FileInputStream(SMALL).getChannel();
		byte[] keywords="张".getBytes("UTF-8");
		long lastLineStart=0;
		int lastLineLength=CACHE_SIZE;
		//fc.read(buff,lastLineStart,lastLineLength);
		while(true){
			
		}

		/*while(fc.read(buff)!=-1){
			buff.flip();

			if(Bytes.indexOf(buff.array(),keywords)!=-1){
				
			}
			//System.out.println(ByteUtil.toHexString(buff.array()));
			buff.clear();
		};
		fc.close();*/
	}
	public static void main(String[] args) throws IOException {
		Stopwatch watch=new Stopwatch();
		watch.start();
		//InputSupplier<FileInputStream> fileIn=Files.newInputStreamSupplier(new File(PATH));
		//System.out.println(new String(ByteStreams.toByteArray(ByteStreams.slice(fileIn,1073200000L,10000L))));
		/*File all=new File(PATH);
		if(all!=null&&  ( !all.exists() || (all.exists()&&all.delete()) ) ){
			Files.touch(all);
			OutputSupplier<OutputStreamWriter> writer=Files.newWriterSupplier(new File("G:/2000W/all.csv"), Charsets.UTF_8, true);
			Files.copy(new File("G:/2000W/1-200W.csv"),Charsets.UTF_8,writer);
			Files.copy(new File("G:/2000W/1000W-1200W.csv"),Charsets.UTF_8,writer);
			Files.copy(new File("G:/2000W/1200W-1400W.csv"),Charsets.UTF_8,writer);
			Files.copy(new File("G:/2000W/1400W-1600W.csv"),Charsets.UTF_8,writer);
			Files.copy(new File("G:/2000W/1600w-1800w.csv"),Charsets.UTF_8,writer);
			Files.copy(new File("G:/2000W/1800w-2000w.csv"),Charsets.UTF_8,writer);
			Files.copy(new File("G:/2000W/200W-400W.csv"),Charsets.UTF_8,writer);
			Files.copy(new File("G:/2000W/400W-600W.csv"),Charsets.UTF_8,writer);
			Files.copy(new File("G:/2000W/600W-800W.csv"),Charsets.UTF_8,writer);
			Files.copy(new File("G:/2000W/800W-1000W.csv"),Charsets.UTF_8,writer);
			Files.copy(new File("G:/2000W/5000.csv"),Charsets.UTF_8,writer);
		}*/
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
		File all=new File(PATH);
		System.out.println(Files.readFirstLine(all,Charsets.UTF_8));
		/**/Files.readLines(all,Charsets.UTF_8,new LineProcessor<Object>() {
			long count=0L;
			String keyword="袁伟,";
			String keyword1=",ID,422";
			String keyword2=",M,198";
			@Override
			public boolean processLine(String line) throws IOException {
				if(line==null)return false;
				//System.out.println(line.indexOf(keyword));
				//line.startsWith(keyword)
				if(line.indexOf(keyword)!=-1 && line.indexOf(keyword1)!=-1 && line.indexOf(keyword2)!=-1/**/){
					count++;
					System.out.println(line);
				}
				if(count<2000){
					//System.out.println("count:"+count);
					return true;
				}
				return false;
			}

			@Override
			public Object getResult() {
				return null;
			}
		});
		//readFile();
		System.out.println(watch.stop().toString());
	}
}
