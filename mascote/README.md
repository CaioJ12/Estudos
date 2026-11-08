# Mascotes do canal

Bonecos no estilo designer toy (vinil 3D fofo), da mesma coleção.

## Wez
- `index.html`: ficha do Wez, com vistas, humores e o Wez andando conforme a página rola.
- `flat.html` e `wez.svg`: versão 2D em vetor (rubber hose), com duas expressões.
- `renders/wez-*`: hero, andando, vistas, humores e recortes com fundo transparente.

## Cacau
- `cacau.html`: ficha do Cacau no mesmo formato.
- `renders/cacau-*`: hero (joinha), andando, vistas, humores e recortes com fundo transparente.

## Antônio
- `antonio.html`: ficha do Antônio no mesmo formato.
- `renders/antonio-*`: hero (hang loose), andando, vistas, humores e recortes com fundo transparente.

## Guadalupe
- `guadalupe.html`: ficha da Guadalupe no mesmo formato.
- `renders/guadalupe-*`: hero (mão na cintura), andando, vistas, humores e recortes com fundo transparente.

## Coleção em 3D
- `3d.html`: os quatro modelados em 3D com three.js (formas de brinquedo), com animações de parado, acenar, andar e dançar, e pulinho ao tocar. Precisa de servidor local (ex.: `python3 -m http.server`).
- `compartilhar/3d.html`: a mesma cena em arquivo único, abre direto.
- `vendor/`: three.js 0.160 e OrbitControls.

## Arquivos para compartilhar
- `compartilhar/cacau.html`, `compartilhar/antonio.html` e `compartilhar/guadalupe.html`: as mesmas páginas em arquivo único, com as imagens embutidas. Abrem sozinhas, sem a pasta `renders/`.

As imagens foram geradas com o gerador de imagens do Figma. Os recortes vêm de versões em fundo verde (chroma key).
Para ver, abra `index.html`, `cacau.html`, `antonio.html` ou `guadalupe.html` no navegador e role a página.
