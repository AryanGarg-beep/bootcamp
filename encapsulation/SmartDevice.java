import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SmartDevice {
  // TODO: Create fields for different property types:
  // Read-only properties:
  // - deviceId (String) - set once during construction
  // - manufacturingDate (LocalDateTime) - set once during construction
  // - serialNumber (String) - generated automatically
  private final String deviceId;
  private final LocalDateTime manufacturingDate;
  private final String serialNumber;

  // Write-only properties:
  // - encryptionKey (String) - can be set but never retrieved
  // - adminPassword (String) - can be changed but never read
  // Read-write properties:
  // - deviceName (String) - normal getter/setter
  // - isEnabled (boolean) - normal getter/setter
  private String deviceName;
  private boolean isEnabled;

  // Computed read-only properties:
  // - uptime (long) - calculated from startup time
  // - deviceAge (int) - calculated from manufacturing date

  // TODO: Private fields for internal state:
  // - startupTime (LocalDateTime)
  // - hashedEncryptionKey (int) - stores hash, not actual key
  // - hashedAdminPassword (int) - stores hash, not actual password
  private final LocalDateTime startupTime;
  private int hashedEncryptionKey;
  private int hashedAdminPassword;

  // TODO: Create constructor that:
  // - Sets read-only properties (deviceId, manufacturingDate, serialNumber)
  // - Records startup time
  // - Requires initial deviceName
  public SmartDevice(String deviceName) {
    this.deviceId = UUID.randomUUID().toString();
    this.manufacturingDate = LocalDateTime.now();
    this.serialNumber = UUID.randomUUID().toString().substring(0, 8);
    this.startupTime = LocalDateTime.now();
    this.deviceName = deviceName;
    this.isEnabled = true;
  }

  // TODO: Implement Read-Only Property Methods:
  public String getDeviceId() {
    return deviceId;
  }

  public LocalDateTime getManufacturingDate() {
    return manufacturingDate;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public long getUptime() {
    return ChronoUnit.SECONDS.between(startupTime, LocalDateTime.now());
  }

  public int getDeviceAge() {
    return (int) ChronoUnit.YEARS.between(manufacturingDate, LocalDateTime.now());
  }

  // TODO: Implement Write-Only Property Methods:
  public void setEncryptionKey(String key) {
    if (key != null && key.length() >= 8) {
      this.hashedEncryptionKey = key.hashCode();
    }
  }

  public void setAdminPassword(String password) {
    if (password != null && password.length() >= 6) {
      this.hashedAdminPassword = password.hashCode();
    }
  }

  public boolean validateEncryptionKey(String key) {
    return key != null && key.hashCode() == this.hashedEncryptionKey;
  }

  public boolean validateAdminPassword(String password) {
    return password != null && password.hashCode() == this.hashedAdminPassword;
  }

  // TODO: Implement Read-Write Property Methods:
  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String name) {
    this.deviceName = name;
  }

  public boolean isEnabled() {
    return isEnabled;
  }

  public void setEnabled(boolean enabled) {
    this.isEnabled = enabled;
  }

  // TODO: Create utility methods:
  public Map<String, String> getPropertyInfo() {
    Map<String, String> info = new HashMap<>();
    info.put("deviceId", "Read-Only");
    info.put("manufacturingDate", "Read-Only");
    info.put("serialNumber", "Read-Only");
    info.put("uptime", "Computed Read-Only");
    info.put("deviceAge", "Computed Read-Only");
    info.put("encryptionKey", "Write-Only");
    info.put("adminPassword", "Write-Only");
    info.put("deviceName", "Read-Write");
    info.put("isEnabled", "Read-Write");
    return info;
  }

  public void resetDevice() {
    this.hashedEncryptionKey = 0;
    this.hashedAdminPassword = 0;
  }

  public static void main(String[] args) {
    // TODO: Create SmartDevice object
    SmartDevice dev1 = new SmartDevice("Router");
    SmartDevice dev2 = new SmartDevice("Camera");

    // TODO: Demonstrate read-only properties:
    System.out.println("Device 1 ID: " + dev1.getDeviceId());
    System.out.println("Device 1 Serial: " + dev1.getSerialNumber());
    System.out.println("Device 1 Manufacturing Date: " + dev1.getManufacturingDate());
    System.out.println("Device 1 Uptime (s): " + dev1.getUptime());
    System.out.println("Device 1 Age (years): " + dev1.getDeviceAge());

    // TODO: Demonstrate write-only properties:
    dev1.setEncryptionKey("MySecretKey123");
    dev1.setAdminPassword("StrongPass");
    System.out.println("Encryption key valid? " + dev1.validateEncryptionKey("MySecretKey123"));
    System.out.println("Admin password valid? " + dev1.validateAdminPassword("StrongPass"));

    // TODO: Demonstrate read-write properties:
    System.out.println("Device 1 Name: " + dev1.getDeviceName());
    dev1.setDeviceName("Smart Router");
    dev1.setEnabled(false);
    System.out.println("Updated Device 1 Name: " + dev1.getDeviceName());
    System.out.println("Is Enabled? " + dev1.isEnabled());

    // TODO: Create multiple devices and show property independence
    System.out.println("Device 2 ID: " + dev2.getDeviceId());
    System.out.println("Device 2 Name: " + dev2.getDeviceName());

    // TODO: Test property access patterns with different scenarios
    dev2.setEncryptionKey("AnotherKey999");
    System.out.println("Device 2 Encryption Key Valid? " + dev2.validateEncryptionKey("AnotherKey999"));

    System.out.println("\nProperty Info for Device 1: " + dev1.getPropertyInfo());
  }
}
