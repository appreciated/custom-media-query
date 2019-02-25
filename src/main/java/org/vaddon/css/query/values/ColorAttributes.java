package org.vaddon.css.query.values;

import org.vaddon.css.query.MediaQueryUnit;

public interface ColorAttributes {
    class Color implements MediaQueryUnit {
        private int color;

        public Color(int color) {
            this.color = color;
        }

        @Override
        public String getValue() {
            return String.valueOf(color);
        }

        @Override
        public boolean hasPrefix() {
            return true;
        }

        @Override
        public String getPrefixValue() {
            return "color: ";
        }
    }

    class MinColor extends org.vaddon.css.query.values.ColorAttributes.Color {
        public MinColor(int color) {
            super(color);
        }

        @Override
        public String getPrefixValue() {
            return "min-" + super.getPrefixValue();
        }
    }

    class MaxColor extends org.vaddon.css.query.values.ColorAttributes.Color {
        public MaxColor(int color) {
            super(color);
        }

        @Override
        public String getPrefixValue() {
            return "max-" + super.getPrefixValue();
        }
    }
}
