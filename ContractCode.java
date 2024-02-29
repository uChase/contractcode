public class ContractCode {
    
    
    public static double calculateDotProduct(double[] vector1, double[] vector2) {
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }
        
        double dotProduct = 0.0;
        for (int i = 0; i < vector1.length; i++) {
            dotProduct += vector1[i] * vector2[i];
        }
        
        return dotProduct;
    }

    public static double[] calculateCrossProduct(double[] vector1, double[] vector2) {
        if (vector1.length != 3 || vector2.length != 3) {
            throw new IllegalArgumentException("Vectors must have length 3 for cross product calculation");
        }
        
        double[] crossProduct = new double[3];
        crossProduct[0] = vector1[1] * vector2[2] - vector1[2] * vector2[1];
        crossProduct[1] = vector1[2] * vector2[0] - vector1[0] * vector2[2];
        crossProduct[2] = vector1[0] * vector2[1] - vector1[1] * vector2[0];
        
        return crossProduct;
    }   
}
