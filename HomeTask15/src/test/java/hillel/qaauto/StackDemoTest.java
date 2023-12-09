package hillel.qaauto;

import org.testng.Assert;
import org.testng.annotations.*;


public class StackDemoTest extends StackDemoBase {
    int qtyItems;

    @Test
    public void task1() {
        qtyItems = 2;
        addItemsInBagInOrderOnMainPage(qtyItems);
        int qtyItemInBag = checkQtyItemsInBag();

        Assert.assertEquals(qtyItems, qtyItemInBag, "The difference between the amount added and amount in the bag.");

        for (int i = 1; i <= qtyItems; i++) {
            String addedItemName = checkItemNameByIdOnMainPage(i);
            String itemInBagName = checkItemNameByOrderInBag(i);
            Assert.assertEquals(addedItemName, itemInBagName, "Different names in the bag and on the page.");
        }

        for (int i = 1; i <= qtyItems; i++) {
            double addedItemPrice = checkItemPriceByIdOnMainPage(i);
            double itemInBagPrice = checkItemPriceByOrderInBag(i);
            Assert.assertEquals(addedItemPrice, itemInBagPrice, "Different prices in the bag and on the page.");
        }

        double totalPriceInBag = checkTotalPriceInBag();
        double totalPriceAddedItems = 0;
        for (int i = 1; i <= qtyItems; i++) {
            totalPriceAddedItems += checkItemPriceByIdOnMainPage(i);
        }
        Assert.assertEquals(totalPriceAddedItems, totalPriceInBag, "The sum of the prices of the added items differs from the sum in the bag.");

        Assert.assertTrue(availableCheckoutButton(), "Checkout button is not displayed.");
    }

    @Test
    public void task2() {
        qtyItems = 1;
        addItemsInBagInOrderOnMainPage(qtyItems);
        openBag();
        deleteItemFromBagByPosition(1);

        Assert.assertTrue(checkCorrectMessageInEmptyBag(), "Wrong message displayed in the empty bag.");

        Assert.assertEquals(0.0, checkTotalPriceInBag(), "Total price not zero in empty bag.");

        Assert.assertTrue(checkCorrectMessageInBuyButton(true), "The button in the bag has the wrong message.");
    }
}
