package com.afs.tdd;

public enum Direction {
    N{
        @Override
        Direction rotateLeft(){
            return W;
        }

    },

    S {
        @Override
        Direction rotateLeft() {
            return E;
        }

    },

    E {
        @Override
        Direction rotateLeft() {
            return N;
        }

    },

    W {
        @Override
        Direction rotateLeft() {
            return S;
        }
    };

    abstract Direction rotateLeft();

}
