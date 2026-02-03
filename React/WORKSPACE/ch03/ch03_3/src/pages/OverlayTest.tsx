import { Title, Div, Icon, Overlay } from "../components";

export default function OverlayTest() {
  return (
    <section className="mt-4">
      <Title>OverlayTest</Title>
      <Overlay opacityClass="bg-black/70">
        <Div className="relative flex items-center justify-center p-8 bg-white h-1/2">
          <Div className="absolute" right="1rem" top="1rem">
            <Icon name="close" className="text-gray-500" />
          </Div>
          <p className="text-5xl">modal dialog bos</p>
        </Div>
      </Overlay>
      {/* <div style={{ width: "500px", height: "500px" }}></div> */}
    </section>
  );
}
