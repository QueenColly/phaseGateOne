from unnitest import TestCase
import mini_parking_lot

class mini_parking_lot_Test(TestCase):

    def test_that_parkingSlotIs20(self):
        total = 20 
        actual = mini_parking_lot.get_slots([])
        expected =   "total"
        self.assertEqual(actual, expected)

    def test_that_parkingSlotIsEmpty(self):
        given = 0
        actual = mini_parking_lot.get_slots(given)
        expected =   "available"
        
        self.assertEqual(actual, expected)

     def test_that_parkingSlotIsOccupied(self):
        given = 1
        actual = mini_parking_lot.get_slots(given)
        expected =   "filled"
        
        self.assertEqual(actual, expected)

     def test_that_parkingSlot12IsFree_when_car_leaves(self):
        given = 12
        actual = mini_parking_lot.get_slots(given)
        expected =   "leave"
        
        self.assertEqual(actual, expected)

    
     def test_that_parkingStatus20Is_free_for_parking(self):
        given = 2
        actual = mini_parking_lot.get_slots(given)
        expected =   "free"
        
        self.assertEqual(actual, expected)

    def test_that_parkingStatus9Is_not_available(self):
        given = 9
        actual = mini_parking_lot.get_slots(given)
        expected =   "Not Available"
        
        self.assertEqual(actual, expected)

