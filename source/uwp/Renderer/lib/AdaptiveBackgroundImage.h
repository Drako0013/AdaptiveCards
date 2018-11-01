#pragma once

#include "AdaptiveCards.Rendering.Uwp.h"
#include "Enums.h"
#include "BackgroundImage.h"
#include <windows.foundation.h>

namespace AdaptiveNamespace
{
    class DECLSPEC_UUID("60F8A683-A7A3-4E34-BE86-C809F61BD5B6") AdaptiveBackgroundImage
        : public Microsoft::WRL::RuntimeClass<Microsoft::WRL::RuntimeClassFlags<Microsoft::WRL::RuntimeClassType::WinRt>,
                                              ABI::AdaptiveNamespace::IAdaptiveBackgroundImage>
    {
        AdaptiveRuntime(AdaptiveBackgroundImage);

    public:
        AdaptiveBackgroundImage();
        HRESULT RuntimeClassInitialize() noexcept;
        HRESULT RuntimeClassInitialize(_In_ const std::shared_ptr<AdaptiveSharedNamespace::BackgroundImage>& sharedImage);

        IFACEMETHODIMP get_Url(_Out_ HSTRING* url);
        IFACEMETHODIMP put_Url(_In_ HSTRING url);

        IFACEMETHODIMP get_Mode(_Out_ BackgroundImageMode* mode);
        IFACEMETHODIMP put_Mode(_In_ BackgroundImageMode mode);

        IFACEMETHODIMP get_HorizontalAlignment(_Out_ HAlignment* hAlignment);
        IFACEMETHODIMP put_HorizontalAlignment(_In_ HAlignment hAlignment);

        IFACEMETHODIMP get_VerticalAlignment(_Out_ VAlignment* vAlignment);
        IFACEMETHODIMP put_VerticalAlignment(_In_ VAlignment vAlignment);

    private:
        Microsoft::WRL::Wrappers::HString m_url;
        ABI::AdaptiveNamespace::BackgroundImageMode m_mode;
        ABI::AdaptiveNamespace::HAlignment m_horizontalAlignment;
        ABI::AdaptiveNamespace::VAlignment m_verticalAlignment;
    };
    ActivatableClass(AdaptiveBackgroundImage);
}
