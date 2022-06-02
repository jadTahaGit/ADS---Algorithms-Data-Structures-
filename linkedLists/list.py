# Definition
class List:
    # Constructor
    def __init__(self, value=None, next=None):
        self.value = value  # „payload“
        self.next = next  # next darf null sein.

    # Print
    def show(self):
        print(self.value, end=" ")
        if self.next != None:
            self.next.show()


# Example call
l = List(1, List(2, List(3)))
l.show()
