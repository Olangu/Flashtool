package libusb.jna;

import com.sun.jna.Structure;
import com.sun.jna.Structure.ByReference;
import com.sun.jna.Structure.ByValue;

public class libusb_interface extends Structure
{
  public libusb_interface_descriptor.ByReference altsetting;
  public int num_altsetting;

  public libusb_interface_descriptor.ByReference getAltsetting()
  {
    return this.altsetting;
  }
  public void setAltsetting(libusb_interface_descriptor.ByReference altsetting) {
    this.altsetting = altsetting;
  }

  public int getNum_altsetting()
  {
    return this.num_altsetting;
  }
  public void setNum_altsetting(int num_altsetting) {
    this.num_altsetting = num_altsetting;
  }

  public libusb_interface() {
    initFieldOrder();
  }
  protected void initFieldOrder() {
    setFieldOrder(new String[] { "altsetting", "num_altsetting" });
  }

  public libusb_interface(libusb_interface_descriptor.ByReference altsetting, int num_altsetting)
  {
    this.altsetting = altsetting;
    this.num_altsetting = num_altsetting;
    initFieldOrder();
  }

  public static class ByReference extends libusb_interface
    implements Structure.ByReference
  {
  }

  public static class ByValue extends libusb_interface
    implements Structure.ByValue
  {
  }
}