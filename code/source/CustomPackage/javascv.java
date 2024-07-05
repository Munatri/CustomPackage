package CustomPackage;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.util.Random;
// --- <<IS-END-IMPORTS>> ---

public final class javascv

{
	// ---( internal utility methods )---

	final static javascv _instance = new javascv();

	static javascv _newInstance() { return new javascv(); }

	static javascv _cast(Object o) { return (javascv)o; }

	// ---( server methods )---




	public static final void generateUUID (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(generateUUID)>> ---
		// @sigtype java 3.5
		Random rand = new Random();
		 int randomNum = rand.nextInt(10000);
		 String outRandomNum=""+randomNum;
		 
		// pipeline
		 IDataCursor pipelineCursor = pipeline.getCursor();
		 IDataUtil.put( pipelineCursor, "outRandomNum", outRandomNum);
		 pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

