package DSassg2;

/**
* DSassg2/ServerInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ServerInterface.idl
* Monday, July 31, 2017 4:57:43 PM EDT
*/

public final class ServerInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public DSassg2.ServerInterface value = null;

  public ServerInterfaceHolder ()
  {
  }

  public ServerInterfaceHolder (DSassg2.ServerInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DSassg2.ServerInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DSassg2.ServerInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DSassg2.ServerInterfaceHelper.type ();
  }

}
