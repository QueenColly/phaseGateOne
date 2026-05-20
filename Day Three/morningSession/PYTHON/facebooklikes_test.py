from unnitest import TestCase
import facebooklikes

class facebooklikesTest(TestCase):

    def test_that_system_activity_remains_empty_when_no_likes(self):
        likes = []
        expected = "Noone likes this"   
        actual = facebooklikes.getlikes([])
        self.assertEqual(actual, expected)


    def test_that_system_activity_one_likes(self):
        likes = 1
        expected = "Peter likes this"  
        actual = facebook.getlikes(likes)
        self.assertEqual(actual, expected)

    def test_that_system_activity_one_likes(self):
        likes = 2
        expected = "Jacob and Alex likes this"  
        actual = facebook.getlikes(likes)
        self.assertEqual(actual, expected)

    def test_that_system_activity_one_likes(self):
        likes = 3
        expected = "Max, John and Mark like this"   
        actual = facebook.getlikes(likes)
        self.assertEqual(actual, expected)

    def test_that_system_activity_one_likes(self):
        likes = 4
        expected =   "Alex, Jacob and @ others like this"
        actual = facebook.getlikes(likes)
        self.assertEqual(actual, expected)

