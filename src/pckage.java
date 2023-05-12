import java.time.LocalDate;
public class pckage {
    private static int packageCounter = 0;
    private String trackingNumber;
    private addres senderAddress;
    private addres recipientAddress;
    private LocalDate estimatedDeliveryDate;

    public pckage(addres senderAddress, addres recipientAddress, LocalDate estimatedDeliveryDate) {
        this.trackingNumber = generateTrackingNumber();
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    // Getter methods
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public addres getSenderAddress() {
        return senderAddress;
    }

    public addres getRecipientAddress() {
        return recipientAddress;
    }

    public LocalDate getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }


    public void setSenderAddress(addres senderAddress) {
        this.senderAddress = senderAddress;
    }

    public void setRecipientAddress(addres recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public void setEstimatedDeliveryDate(LocalDate estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }


    public String toString() {
        return "Tracking Number: " + trackingNumber + "\n" +
                "Sender Address: " + senderAddress.toString() + "\n" +
                "Recipient Address: " + recipientAddress.toString() + "\n" +
                "Estimated Delivery Date: " + estimatedDeliveryDate.toString();
    }


    private String generateTrackingNumber() {
        packageCounter++;
        String packageNumber = String.format("%03d", packageCounter);
        return "AS" + packageNumber;
    }
}
