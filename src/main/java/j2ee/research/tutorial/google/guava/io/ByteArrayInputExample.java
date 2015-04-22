package j2ee.research.tutorial.google.guava.io;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import org.apache.commons.lang.math.RandomUtils;

import java.util.Date;

public class ByteArrayInputExample {
	public static void main(String[] args) throws Exception {
		int size=10000;
		ByteArrayDataOutput byteOut=ByteStreams.newDataOutput();
		for(int i=0;i < size;i++){
			PositionData pData=new PositionData();
			pData.setVehicleId(1);
			pData.setTimestamp((new Date()).getTime());
			pData.setAltitude(RandomUtils.nextFloat());
			pData.setLatitude(1.0f);
			pData.setLongitude(1.0f);
			pData.setSpeed(RandomUtils.nextInt(100));
			byteOut.write(pData.toByteArray());
		}
		byte[] encodedData=byteOut.toByteArray();
		System.out.printf("%d PositionData objects encoded into %d bytes",size,encodedData.length);
	}
}
