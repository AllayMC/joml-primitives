package org.joml.primitives;

import org.joml.Vector3fc;

public interface Spherefc {
    float x();

    float y();

    float z();

    float r();

    /**
     * Translate <code>this</code> by the given vector <code>xyz</code> and store the result in <code>dest</code>.
     *
     * @param xyz  the vector to translate by
     * @param dest will hold the result
     * @return dest
     */
    Spheref translate(Vector3fc xyz, Spheref dest);

    /**
     * Translate <code>this</code> by the vector <code>(x, y, z)</code> and store the result in <code>dest</code>.
     *
     * @param x    the x coordinate to translate by
     * @param y    the y coordinate to translate by
     * @param z    the z coordinate to translate by
     * @param dest will hold the result
     * @return dest
     */
    Spheref translate(float x, float y, float z, Spheref dest);
}
