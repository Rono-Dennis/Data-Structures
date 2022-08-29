public class JavaScript {


    **
            * A container of integers that should support
 * addition, removal, and search for the median integer
 */
    class Container {
        constructor() {
            this.number = [];
            this.length=0;

        }

        /**
         * Adds the specified value to the container
         *
         * @param {number} value
         */
        add(value) {

            this.number.push(value)
            // TODO: implement this method
        }

        /**
         * Attempts to delete one item of the specified value from the container
         *
         * @param {number} value
         * @return {boolean} true, if the value has been deleted, or
         *                   false, otherwise.
         */
        delete(value) {

            // TODO: implement this method
            if(this.number.includes(value, 0)){
      const index = this.number.indexOf(value);
                if(index > -1){
                    this.number.splice(index, 1);
                    return true;
                }
            }
            return false;
        }

        /**
         * Finds the container's median integer value, which is
         * the middle integer when the all integers are sorted in order.
         * If the sorted array has an even length,
         * the leftmost integer between the two middle
         * integers should be considered as the median.
         *
         * @return {number} the median if the array is not empty, or
         * @throws {Error} a runtime exception, otherwise.
         */
        getMedian() {
            // TODO: implement this method
            let size = this.number.length;
            let result =0;
            if(size > 0){
                this.number.sort();

                let middle = size / 2;

                if(size % 2 === 0){
                    result = (this.number[middle - 1]);
                    return result;
                }
                else{
                    result = this.number[middle];
                    return result;
                }
            }
            return result;
            // else{
            //   throw new Error(Error);
            // }

        }

    }

    module.exports = Container;

}
