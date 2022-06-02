class Set {
  collection = [];

  //   this method will return check the presence of an element.
  has(element) {
    return collection.indexOf(element) !== -1;
  }

  //   this method will return all the values in the set:
  values() {
    return collection;
  }

  //   this method will add an element to the set:
  add(element) {
    if (!this.has(element)) {
      collection.push(element);
      return true;
    }
    return false;
  }
  //   this method will remove an element from a set:
  remove(element) {
    if (this.has(element)) {
      index = collection.indexOf(element);
      collection.splice(index, 1);
      return true;
    }
    return false;
  }

  //   this method will return the size of the collection:
  size() {
    return collection.length;
  }

  // this method will return the union of two sets:
  union(otherSet) {
    let unionSet = new Set();
    const firstSet = this.values();
    const secondSet = otherSet.values();
    firstSet.forEach(function (e) {
      unionSet.add(e);
    });
    return unionSet;
  }
}
