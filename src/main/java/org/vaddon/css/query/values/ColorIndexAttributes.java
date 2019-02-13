package org.vaddon.css.query.values;

import org.vaddon.css.query.MediaQueryUnit;

public interface ColorIndexAttributes {
    class ColorIndex implements MediaQueryUnit {
        private int colorIndex;

        public ColorIndex(int colorIndex) {
            this.colorIndex = colorIndex;
        }

        @Override
        public String getValue() {
            return String.valueOf(colorIndex);
        }

        @Override
        public boolean hasPrefix() {
            return true;
        }

        @Override
        public String getPrefixValue() {
            return "color-index: ";
        }
    }
}
