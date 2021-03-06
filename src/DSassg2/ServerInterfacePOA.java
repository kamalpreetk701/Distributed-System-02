package DSassg2;


/**
* DSassg2/ServerInterfacePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ServerInterface.idl
* Monday, July 31, 2017 4:57:43 PM EDT
*/

public abstract class ServerInterfacePOA extends org.omg.PortableServer.Servant
 implements DSassg2.ServerInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("createTRecord", new java.lang.Integer (0));
    _methods.put ("createSRecord", new java.lang.Integer (1));
    _methods.put ("getRecordCount", new java.lang.Integer (2));
    _methods.put ("display", new java.lang.Integer (3));
    _methods.put ("edit", new java.lang.Integer (4));
    _methods.put ("transferRecord", new java.lang.Integer (5));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // DSassg2/ServerInterface/createTRecord
       {
         String manager_id = in.read_string ();
         String f_name = in.read_string ();
         String l_name = in.read_string ();
         String addr = in.read_string ();
         String number = in.read_string ();
         String spec = in.read_string ();
         String loc = in.read_string ();
         String $result = null;
         $result = this.createTRecord (manager_id, f_name, l_name, addr, number, spec, loc);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // DSassg2/ServerInterface/createSRecord
       {
         String manager_id = in.read_string ();
         String f_name = in.read_string ();
         String l_name = in.read_string ();
         String courselist = in.read_string ();
         String status = in.read_string ();
         String $result = null;
         $result = this.createSRecord (manager_id, f_name, l_name, courselist, status);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // DSassg2/ServerInterface/getRecordCount
       {
         String manager_id = in.read_string ();
         String $result = null;
         $result = this.getRecordCount (manager_id);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // DSassg2/ServerInterface/display
       {
         String manager_id = in.read_string ();
         String $result = null;
         $result = this.display (manager_id);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 4:  // DSassg2/ServerInterface/edit
       {
         String manager_id = in.read_string ();
         String id = in.read_string ();
         String field_name = in.read_string ();
         String value = in.read_string ();
         boolean $result = false;
         $result = this.edit (manager_id, id, field_name, value);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 5:  // DSassg2/ServerInterface/transferRecord
       {
         String manager_id = in.read_string ();
         String record_id = in.read_string ();
         String remoteCenterServerName = in.read_string ();
         boolean $result = false;
         $result = this.transferRecord (manager_id, record_id, remoteCenterServerName);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:DSassg2/ServerInterface:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ServerInterface _this() 
  {
    return ServerInterfaceHelper.narrow(
    super._this_object());
  }

  public ServerInterface _this(org.omg.CORBA.ORB orb) 
  {
    return ServerInterfaceHelper.narrow(
    super._this_object(orb));
  }


} // class ServerInterfacePOA
